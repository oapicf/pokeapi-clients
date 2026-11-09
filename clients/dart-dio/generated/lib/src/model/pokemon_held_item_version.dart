//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_held_item_version.g.dart';

/// PokemonHeldItemVersion
///
/// Properties:
/// * [rarity] - How often the item is held.
/// * [version] - The version in which the item is held.
@BuiltValue()
abstract class PokemonHeldItemVersion implements Built<PokemonHeldItemVersion, PokemonHeldItemVersionBuilder> {
  /// How often the item is held.
  @BuiltValueField(wireName: r'rarity')
  int get rarity;

  /// The version in which the item is held.
  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  PokemonHeldItemVersion._();

  factory PokemonHeldItemVersion([void updates(PokemonHeldItemVersionBuilder b)]) = _$PokemonHeldItemVersion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonHeldItemVersionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonHeldItemVersion> get serializer => _$PokemonHeldItemVersionSerializer();
}

class _$PokemonHeldItemVersionSerializer implements PrimitiveSerializer<PokemonHeldItemVersion> {
  @override
  final Iterable<Type> types = const [PokemonHeldItemVersion, _$PokemonHeldItemVersion];

  @override
  final String wireName = r'PokemonHeldItemVersion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonHeldItemVersion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'rarity';
    yield serializers.serialize(
      object.rarity,
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
    PokemonHeldItemVersion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonHeldItemVersionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'rarity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rarity = valueDes;
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
  PokemonHeldItemVersion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonHeldItemVersionBuilder();
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


