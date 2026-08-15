//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_shape_detail_names_inner.g.dart';

/// PokemonShapeDetailNamesInner
///
/// Properties:
/// * [url] 
/// * [name] 
@BuiltValue()
abstract class PokemonShapeDetailNamesInner implements Built<PokemonShapeDetailNamesInner, PokemonShapeDetailNamesInnerBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  @BuiltValueField(wireName: r'name')
  String get name;

  PokemonShapeDetailNamesInner._();

  factory PokemonShapeDetailNamesInner([void updates(PokemonShapeDetailNamesInnerBuilder b)]) = _$PokemonShapeDetailNamesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonShapeDetailNamesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonShapeDetailNamesInner> get serializer => _$PokemonShapeDetailNamesInnerSerializer();
}

class _$PokemonShapeDetailNamesInnerSerializer implements PrimitiveSerializer<PokemonShapeDetailNamesInner> {
  @override
  final Iterable<Type> types = const [PokemonShapeDetailNamesInner, _$PokemonShapeDetailNamesInner];

  @override
  final String wireName = r'PokemonShapeDetailNamesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonShapeDetailNamesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonShapeDetailNamesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonShapeDetailNamesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonShapeDetailNamesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonShapeDetailNamesInnerBuilder();
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

