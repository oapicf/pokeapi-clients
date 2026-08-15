//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_game_index.g.dart';

/// PokemonGameIndex
///
/// Properties:
/// * [gameIndex] 
/// * [version] 
@BuiltValue()
abstract class PokemonGameIndex implements Built<PokemonGameIndex, PokemonGameIndexBuilder> {
  @BuiltValueField(wireName: r'game_index')
  int get gameIndex;

  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  PokemonGameIndex._();

  factory PokemonGameIndex([void updates(PokemonGameIndexBuilder b)]) = _$PokemonGameIndex;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonGameIndexBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonGameIndex> get serializer => _$PokemonGameIndexSerializer();
}

class _$PokemonGameIndexSerializer implements PrimitiveSerializer<PokemonGameIndex> {
  @override
  final Iterable<Type> types = const [PokemonGameIndex, _$PokemonGameIndex];

  @override
  final String wireName = r'PokemonGameIndex';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonGameIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'game_index';
    yield serializers.serialize(
      object.gameIndex,
      specifiedType: const FullType(int),
    );
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(VersionSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonGameIndex object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonGameIndexBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'game_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.gameIndex = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionSummary),
          ) as VersionSummary;
          result.version.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonGameIndex deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonGameIndexBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

