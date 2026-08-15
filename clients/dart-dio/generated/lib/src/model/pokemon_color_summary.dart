//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_color_summary.g.dart';

/// PokemonColorSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class PokemonColorSummary implements Built<PokemonColorSummary, PokemonColorSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  PokemonColorSummary._();

  factory PokemonColorSummary([void updates(PokemonColorSummaryBuilder b)]) = _$PokemonColorSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonColorSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonColorSummary> get serializer => _$PokemonColorSummarySerializer();
}

class _$PokemonColorSummarySerializer implements PrimitiveSerializer<PokemonColorSummary> {
  @override
  final Iterable<Type> types = const [PokemonColorSummary, _$PokemonColorSummary];

  @override
  final String wireName = r'PokemonColorSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonColorSummary object, {
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
    PokemonColorSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonColorSummaryBuilder result,
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
  PokemonColorSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonColorSummaryBuilder();
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

