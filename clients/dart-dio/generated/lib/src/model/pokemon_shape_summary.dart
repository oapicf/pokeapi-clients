//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_shape_summary.g.dart';

/// PokemonShapeSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class PokemonShapeSummary implements Built<PokemonShapeSummary, PokemonShapeSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  PokemonShapeSummary._();

  factory PokemonShapeSummary([void updates(PokemonShapeSummaryBuilder b)]) = _$PokemonShapeSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonShapeSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonShapeSummary> get serializer => _$PokemonShapeSummarySerializer();
}

class _$PokemonShapeSummarySerializer implements PrimitiveSerializer<PokemonShapeSummary> {
  @override
  final Iterable<Type> types = const [PokemonShapeSummary, _$PokemonShapeSummary];

  @override
  final String wireName = r'PokemonShapeSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonShapeSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonShapeSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonShapeSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonShapeSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonShapeSummaryBuilder();
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

